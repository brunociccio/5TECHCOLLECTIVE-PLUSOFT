package br.com.plusoft.fivetechcollective.assembler;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.stereotype.Component;
import br.com.plusoft.fivetechcollective.controller.CadastrarController;
import br.com.plusoft.fivetechcollective.model.Cadastrar;

@Component
public class CadastrarModelAssembler implements RepresentationModelAssembler<Cadastrar, EntityModel<Cadastrar>> {

    @Override
    public EntityModel<Cadastrar> toModel(Cadastrar cadastrar) {
        return EntityModel.of(cadastrar,
                WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(CadastrarController.class).show(cadastrar.getId())).withSelfRel(),
                WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(CadastrarController.class).index(null)).withRel("cadastrar"));
    }
}
