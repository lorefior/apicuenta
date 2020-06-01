package com.lorefior.cash.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.lorefior.cash.model.Loan;
import com.lorefior.cash.model.User;

@Repository
public class LoanPersistencia {


    @PersistenceContext
    private EntityManager entityManager;

    public Loan getLoanByIdUser(User user, String partido) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();

        CriteriaQuery<Loan> criteriaQuery = criteriaBuilder.createQuery(Loan.class);
        Root<Loan> root = criteriaQuery.from(Loan.class);
        Predicate obtenerLoan = criteriaBuilder.like(root.get("nombrePartido"), partido + "%");
        Predicate obtenerProvincia = criteriaBuilder.equal(root.get("provincia"), user);
        Predicate obtenerCombinacion = criteriaBuilder.and(obtenerProvincia, obtenerLoan);
        criteriaQuery.where(obtenerCombinacion);
        TypedQuery<Loan> resultado = entityManager.createQuery(criteriaQuery);
        try {
            return resultado.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
}
