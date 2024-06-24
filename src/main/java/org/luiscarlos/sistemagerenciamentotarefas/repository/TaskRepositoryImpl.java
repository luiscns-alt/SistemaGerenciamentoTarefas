package org.luiscarlos.sistemagerenciamentotarefas.repository;

import java.util.List;

import org.luiscarlos.sistemagerenciamentotarefas.entity.Task;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class TaskRepositoryImpl implements TaskRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Task> customQueryExample() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Task> query = cb.createQuery(Task.class);
        Root<Task> root = query.from(Task.class);

        query.select(root).where(cb.equal(root.get("status"), "IN_PROGRESS"));

        return entityManager.createQuery(query.select(root)).getResultList();
    }
}

