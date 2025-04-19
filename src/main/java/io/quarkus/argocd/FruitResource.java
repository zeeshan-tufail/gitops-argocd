package io.quarkus.argocd;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;

public interface FruitResource extends PanacheEntityResource<Fruit, Long> {
    // This interface can be empty. It will inherit all the methods from PanacheEntityResource.
    // You can add custom methods here if needed.

}
