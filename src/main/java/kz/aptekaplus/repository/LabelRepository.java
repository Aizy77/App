package kz.aptekaplus.repository;

import kz.aptekaplus.model.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LabelRepository extends JpaRepository<Label, UUID> {


}
