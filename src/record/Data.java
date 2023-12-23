package record;

import java.util.Objects;

public record Data(String name, String address) {
    public Data {
        Objects.requireNonNull(name);
        Objects.requireNonNull(address);
    }
    // Constructor
    // Equals and HashCode
    // ToString
}
