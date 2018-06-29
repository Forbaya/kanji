package com.forbaya.kanji.kanji.component;

import com.forbaya.kanji.kanji.domain.Kanji;
import com.forbaya.kanji.kanji.repository.KanjiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {
    private final KanjiRepository kanjiRepository;

    @Autowired
    public DatabaseLoader(KanjiRepository kanjiRepository) {
        this.kanjiRepository = kanjiRepository;
    }

    @Override
    public void run(String... strings) {
        this.kanjiRepository.save(new Kanji(21315));
    }
}
