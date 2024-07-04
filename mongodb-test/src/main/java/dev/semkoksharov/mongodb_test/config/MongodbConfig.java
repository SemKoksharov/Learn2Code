package dev.semkoksharov.mongodb_test.config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import java.util.Collection;
import java.util.Collections;

@Configuration
public class MongodbConfig extends AbstractMongoClientConfiguration {
    @Override
    protected String getDatabaseName() {
        return "test_db";
    }

    @Override
    public MongoClient mongoClient() {
        ConnectionString cs = new ConnectionString("mongodb://localhost:27017/");
        MongoClientSettings mcs = MongoClientSettings.builder()
                .applyConnectionString(cs)
                .build();
        return MongoClients.create(mcs);
    }

    @Override
    protected Collection<String> getMappingBasePackages() {
        return Collections.singleton("dev.semkoksharov");
    }

    @Override
    protected boolean autoIndexCreation() {
        return super.autoIndexCreation();
    }
}
