package com.omegacode.core.batch;

import org.springframework.batch.item.ItemProcessor;

import com.omegacode.core.model.Pagamento;

public class ArchiveProcessor implements ItemProcessor<Pagamento, Pagamento> {

	@Override
	public Pagamento process(Pagamento item) throws Exception {
		return item;
	}
}