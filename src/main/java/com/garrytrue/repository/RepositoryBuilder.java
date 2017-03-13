package com.garrytrue.repository;

import com.garrytrue.repository.impl.ChainedRepository;

public class RepositoryBuilder<T> {
    private ChainedRepository<T> chain;

    public RepositoryBuilder addToChain(CRUDRepository<T> crudRepository) {
        if (chain == null) {
            chain = new ChainedRepository(crudRepository);
        } else {
            ChainedRepository last = findLastInChain();
            last.setNextChain(new ChainedRepository<T>(crudRepository));
        }
        return this;
    }

    private ChainedRepository<T> findLastInChain() {
        ChainedRepository<T> root = chain;
        while (root.getNextChain() != null) {
            root = root.getNextChain();
        }
        return root;
    }

    public ChainedRepository<T> build() {
        return chain;
    }
}