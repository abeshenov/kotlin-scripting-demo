package org.example;

import kotlin.script.experimental.jsr223.KotlinJsr223DefaultScriptEngineFactory;

import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Main {
    public static void main(String[] args) {
        final ScriptEngine kotlinEngine = new KotlinJsr223DefaultScriptEngineFactory().getScriptEngine();

        final String script = "2 + 2";

        try {
            System.out.printf("%s = %s%n", script, kotlinEngine.eval(script));
        } catch (ScriptException e) {
            throw new RuntimeException("Can't evaluate " + script);
        }
    }
}
