package org.aptech.t2311e.beflutter.controller;

import org.aptech.t2311e.beflutter.model.Place;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/places")
@CrossOrigin(origins = "*")
public class PlaceController {

    @GetMapping
    public List<Place> getAllPlace() {
        return Arrays.asList(
                new Place(1L, "Hà Nội", "https://tse4.mm.bing.net/th/id/OIP.U4qkbrQ2P80ghwdnVkyYhAHaFn?pid=Api&P=0&h=220", "Việt Nam"),
                new Place(2L, "Hội An", "https://tse1.mm.bing.net/th/id/OIP.1dajQ4hFwNgZ9oLZj6ZqBAHaE7?pid=Api&P=0&h=220", "Việt Nam"),
                new Place(3L, "Đà nẵng", "https://tse1.mm.bing.net/th/id/OIP.R7juhpQtijPGba5UY9gLYgHaEK?pid=Api&P=0&h=220", "Việt Nam"),
                new Place(3L, "Sài Gòn", "https://tse3.mm.bing.net/th/id/OIP.cQn44jV2xekxOVyT499h5wHaEV?pid=Api&P=0&h=220", "Việt Nam"),
                new Place(3L, "Huế", "https://tse2.mm.bing.net/th/id/OIP.FllJxH-aOdTAjxN8QbDUSAHaEK?pid=Api&P=0&h=220", "Việt Nam")
        );
    }
}
