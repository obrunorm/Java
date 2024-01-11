package java.com.example.jpah2demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api-jpa-h2")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping("/addClient")
    public ResponseEntity<Cliente> addClient(@RequestBody Cliente cliente) {
        // TODO
        try {
            cliente.setId(null);
            Cliente clientCreated = clienteRepository.save(cliente);
            return ResponseEntity.status(HttpStatus.CREATED).body(clientCreated);

        } catch (Exception e){
            System.out.println("Error on create Client: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }

    }

    @GetMapping("/findAllClients")
    public ResponseEntity<List<Cliente>> findAllClients() {
        // TODO
        return (ResponseEntity<List<Cliente>>) clienteRepository.findAll();
    }

    @GetMapping("/findClientById/{id}")
    public Optional<Cliente> findClientById(@PathVariable("id") Long idClient) {
        // TODO
        return  clienteRepository.findById(idClient);
    }

    @DeleteMapping("/removeClientById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removerCliente(@PathVariable("id") Long idClient){
        // TODO
        clienteRepository.deleteById(idClient);
    }

    @PutMapping("/updateClientById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCliente(@PathVariable("id") Long id, @RequestBody Cliente cliente){
        // TODO
        try {
            Optional<Cliente> clientFound = clienteRepository.findById(id);

            if (clientFound.isPresent()){
                Cliente clientUpdate = clientFound.get();
                clientUpdate.setNome(cliente.getNome());
                clientUpdate.setIdade(cliente.getIdade());
                clientUpdate.setEmail(cliente.getEmail());
                clientUpdate.setEndereco(cliente.getEndereco());
                clientUpdate.setTelefone(cliente.getTelefone());
                clienteRepository.save(clientUpdate);
            }

        } catch (Exception e){
            System.out.println("Error on update client: " + e.getMessage());
        }
    }
}
