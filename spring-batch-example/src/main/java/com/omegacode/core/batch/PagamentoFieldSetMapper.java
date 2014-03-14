package com.omegacode.core.batch;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.omegacode.core.CacheService;
import com.omegacode.core.model.Pagamento;

public class PagamentoFieldSetMapper extends CacheService implements FieldSetMapper<Pagamento> {

	@Override
	public Pagamento mapFieldSet(FieldSet fieldSet) throws BindException {
		
		Pagamento pagamento = new Pagamento();
		pagamento.setNumeroCartao(fieldSet.readInt(0));
		pagamento.setNomeCliente(fieldSet.readString(1));
		pagamento.setStatus(fieldSet.readString(2));
		
		super.addCache(pagamento.getNumeroCartao(), pagamento);
		return pagamento;
	}
}