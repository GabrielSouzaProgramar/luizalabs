package br.luizalabs.resoureces;

import br.luizalabs.controller.ProdutoController;
import br.luizalabs.model.Produto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.ArrayList;

/**
 * Classe responsável por conter os métodos REST de acesso ao webservice
 *
 * @author Gabriel.Souza
 * @since 18/09/2017 : 00:00
 * @version 1.0
 */
@Path("/produto")
public class ProdutoResource {

    @GET
    @Path("/listar")
    @Produces("application/json")
    public ArrayList<Produto> listar(){
        return new ProdutoController().listar();
    }

}
