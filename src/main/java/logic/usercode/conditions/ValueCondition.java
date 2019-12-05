package logic.usercode.conditions;

import farmio.Farmio;
import farmio.exceptions.FarmioException;
import org.json.simple.JSONObject;

public class ValueCondition extends Condition {

    public static final String JSON_KEY_TYPE = "condition_value_type";
    public static final String JSON_KEY_COMPARATOR = "comparator";
    public static final String JSON_KEY_VALUE = "value";
    public static final String CONDITION_TYPE = "value";

    private ValueConditionType type;
    private Comparator comparator;
    private int value;

    /**
     * Constructor for ValueCondition.
     *
     * @param type asset type from ValueConditionType enum
     * @param comparator comparator from Comparator enum
     * @param value integer value to compare the asset against
     */
    public ValueCondition(ValueConditionType type, Comparator comparator, int value) {
        super(Type.VALUE);
        this.type = type;
        this.comparator = comparator;
        this.value = value;
    }

    @Override
    public boolean check(Farmio farmio) throws FarmioException {
        return ConditionChecker.check(type, comparator, value, farmio);
    }

    @Override
    public JSONObject toJson() {
        JSONObject object = super.toJson();
        object.put(JSON_KEY_TYPE, type.name());
        object.put(JSON_KEY_COMPARATOR, comparator.name());
        object.put(JSON_KEY_VALUE, value);
        return object;
    }

    public String toString() {
        return type.name() + " " + comparatorToString() + " " + Integer.toString(value);
    }

    private String comparatorToString() {
        switch (comparator) {
        case greaterThanOrEquals:
            return ">=";
        case greaterThan:
            return ">";
        case lessThan:
            return "<";
        case lessThanOrEquals:
            return "<=";
        default:
            return "";
        }
    }
}
