package com.patch.org.h.valid;

import org.osgl.util.N;

public enum Op {


    EQ {
        @Override
        public boolean compare(Number v1, Number v2) {
            return N.eq(v1, v2);
        }
    },
    NE {
        @Override
        public boolean compare(Number v1, Number v2) {
            return N.neq(v1, v2);
        }
    },
    GT {
        @Override
        public boolean compare(Number v1, Number v2) {
            return N.gt(v1, v2);
        }
    },
    LT {
        @Override
        public boolean compare(Number v1, Number v2) {
            return N.lt(v1, v2);
        }
    };

    public abstract boolean compare(Number v1, Number v2);

}
