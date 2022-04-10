package com.Lab2.library.repository;

import com.Lab2.library.model.BookCategory;
import com.Lab2.library.repository.interfaces.IBookCategoryRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class BookCategoryRepository implements IBookCategoryRepository {
    @Override
    public List<BookCategory> findAll() {
        return null;
    }

    @Override
    public List<BookCategory> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<BookCategory> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<BookCategory> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(BookCategory entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends BookCategory> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends BookCategory> S save(S entity) {
        return null;
    }

    @Override
    public <S extends BookCategory> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<BookCategory> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends BookCategory> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends BookCategory> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<BookCategory> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public BookCategory getOne(Long aLong) {
        return null;
    }

    @Override
    public BookCategory getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends BookCategory> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends BookCategory> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends BookCategory> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends BookCategory> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends BookCategory> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends BookCategory> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends BookCategory, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
