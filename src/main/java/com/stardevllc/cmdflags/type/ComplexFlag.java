package com.stardevllc.cmdflags.type;

import com.stardevllc.cmdflags.FlagType;

public class ComplexFlag extends AbstractFlag {
    private final Object defaultValue;

    public ComplexFlag(String id, String name, Object defaultValue) {
        super(id, name);
        this.defaultValue = defaultValue;
    }

    @Override
    public FlagType type() {
        return FlagType.COMPLEX;
    }

    @Override
    public Object defaultValue() {
        return defaultValue;
    }
}
