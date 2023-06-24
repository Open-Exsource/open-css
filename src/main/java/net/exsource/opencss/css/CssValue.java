package net.exsource.opencss.css;

import net.exsource.openutils.tools.Commons;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public record CssValue(@NotNull Object value) {

    public <T> T asCast(Class<T> cast) {
        return Commons.cast(value, cast);
    }

    public String asString() {
        return asCast(String.class);
    }

    public Integer asInt() {
        return asCast(Integer.class);
    }

    public Boolean asBoolean() {
        return asCast(Boolean.class);
    }

    public Float asFloat() {
        return asCast(Float.class);
    }

    public Double asDouble() {
        return asCast(Double.class);
    }

    public Byte asByte() {
        return asCast(Byte.class);
    }

    public Short asShort() {
        return asCast(Short.class);
    }

}
