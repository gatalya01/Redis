package com.example.service.redis.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@ConfigurationProperties(prefix = "book.cache")
public class BookCacheProperties {

    private List<String> cacheNames;
    private Map<String, CacheProperties> caches;

    @Data
    public static class CacheProperties {
        private Duration expiry = Duration.ZERO;
    }

    public static class CacheNames {
        public static final String FIND_ALL_BOOKS = "findAllBooks";
        public static final String FIND_BY_BOOK_ID = "findByBookId";
        public static final String FIND_ALL_BY_CATEGORY = "findAllByCategory";
        public static final String FIND_BY_AUTHOR_AND_NAME = "findByAuthorAndName";
    }
}