package tacocloud.tacocloudapplication.data;

import tacocloud.tacocloudapplication.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();
    Ingredient findOne(String id);
    Ingredient save(Ingredient ingredient);
}