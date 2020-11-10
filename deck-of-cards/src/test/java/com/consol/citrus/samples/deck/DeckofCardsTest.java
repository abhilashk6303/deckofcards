package com.consol.citrus.samples.deck;

import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.dsl.testng.TestNGCitrusTestRunner;
import com.consol.citrus.message.MessageType;
import org.apache.http.entity.ContentType;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.Test;

@ContextConfiguration
public class DeckofCardsTest extends TestNGCitrusTestRunner {
    @Test
    @CitrusTest
    public void testnewdeck() {
        http(httpActionBuilder -> httpActionBuilder
            .client("https://deckofcardsapi.com/api/deck/new/")
            .receive()
            .response(HttpStatus.OK)
            .messageType(MessageType.JSON)
            .payload("{ \"success\": \"true\", \"deck_id\": \"pqmsfkwwt9p8\", \"remaining\": \"52\", \"shuffled\": false}"));
    }
}
