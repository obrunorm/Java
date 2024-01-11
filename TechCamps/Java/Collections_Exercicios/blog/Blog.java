import java.util.*;

public class Blog {

     private List<Post> posts;

     public Blog(){
          this.posts = new ArrayList<Post>();
     }

     public void adicionarPostagem(Post post){
          this.posts.add(post);
     }

     public Set<String> obterTodosAutores(){

          LinkedHashSet<String> autores = new LinkedHashSet<String>();

          Collections.sort(this.posts, (Post p1, Post p2) -> {
               return p1.getAutor().compareToIgnoreCase(p2.getAutor());
          });

          this.posts.forEach(post -> autores.add(post.getAutor()));

          return autores;
     }

     public Map<String, Integer> obterContagemPorCategoria(){
          Map<String, Integer> result = new LinkedHashMap<String, Integer>();

          Collections.sort(this.posts, (Post p1, Post p2) -> {
               return p1.getCategoria().compareToIgnoreCase(p2.getCategoria());
          });

          this.posts.forEach(posts -> {
               result.compute(posts.getCategoria(), (key, value) -> {
                    if(value == null)
                         return 1;
                    else
                         return value + 1;
               });
          });

          return result;
     }
}