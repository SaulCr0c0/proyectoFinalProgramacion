/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ACER
 */
public class TableroTest {
    @Test
    public void testGenerarTriangulo(){
        Tablero tablaPrueba = new Tablero();
        tablaPrueba.generarTriangulo();
        
        
        assertArrayEquals(new char[]{' ',' ',' ','*',' ',' ',' '}, tablaPrueba.getmTablero()[0]);
        assertArrayEquals(new char[]{' ',' ','*','*','*',' ',' '}, tablaPrueba.getmTablero()[1]);
        assertArrayEquals(new char[]{' ','*','*','*','*','*',' '}, tablaPrueba.getmTablero()[2]);
        assertArrayEquals(new char[]{'*','*','*','*','*','*','*'}, tablaPrueba.getmTablero()[3]);
    }
}