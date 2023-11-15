package org.yi.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Getter
@Setter
public class RestaurantManagementSystem {
    private static final int MAX_COMBO_NUM = 20;

    private int comboNum = 0;
    private Combo[] combos;

    public RestaurantManagementSystem() {
        this.combos = new Combo[MAX_COMBO_NUM];
    }

    public void addCombo(Combo combo) {
        if (comboNum < MAX_COMBO_NUM) {
            // add the combo
            combos[comboNum] = combo;
        } else {
            // reach the cap
            System.out.printf("There are %d combos already. Add combo failed.", MAX_COMBO_NUM);
        }
    }

    @Override
    public String toString() {
        String combosStr = "[";
        for (Combo combo : combos) {
            if (combo != null) {
                combosStr += combo + ", ";
            }
        }
        combosStr += "]";

        return "RestaurantManagementSystem{" +
                "combos=" + combosStr +
                '}';
    }
}
