package com.forbaya.kanji.kanji.repository;

import com.forbaya.kanji.kanji.domain.Kanji;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KanjiRepository extends JpaRepository<Kanji, Long> {
}
