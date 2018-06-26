package com.forbaya.kanji.kanji.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;


@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Kanji extends AbstractPersistable<Long> {
}
