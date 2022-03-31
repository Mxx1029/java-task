package com.cgi.bootcamp.practice.shapes;

import netscape.javascript.JSObject;

public abstract class InfoShape implements Shape {

    public String info() {
        if (c) {
            c.perimeter();
            c.area();
            System.out.println(JSObject c);
        } else if (r) {
            r.perimeter();
            r.area();
            System.out.println(JSObject r);
        } else {
            s.perimeter();
            s.area();
            System.out.println(JSObject s);
        }
    }

}
