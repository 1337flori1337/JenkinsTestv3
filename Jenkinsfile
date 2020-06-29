pipeline {

    agent any 

    stages {
        stage('Build') { 
            steps {
                echo("Building Stage")
            }
        }
        stage('Test') { 
            steps {
                package example.org.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import example.org.Rechner;

public class RechnerTest {

	Rechner r;
	
	@Before
	public void init() {
		r = new Rechner();
	}
	
	@Test
	public void additionTest1() {
		assertEquals(0.0, r.addiere(5.0, -5.0), 0.0);
	}
	
	@Test
	public void additionTest2() {
		assertEquals(0.1, r.addiere(0.05, 0.05), 0.0);
	}
	
	@Test
	public void subtrahiereTest1() {
		assertEquals(0.1, r.subtrahiere(0.3, 0.2), 0.0);
	}
	
	@Test
	public void divisionbyZero() {
		assertEquals(0.0, r.dividiere(10, 0), Double.POSITIVE_INFINITY);
	}
	
	@Test 
	public void divisionTest1() {
		assertEquals(3.5, r.dividiere(7.0, 2.0), 0.0);
	}
	
	@Test
	public void multiplikationTest1() {
		assertEquals(5.0, r.multipliziere(2.5, 2.0), 0.0);
	}
	
	@Test 
	public void fakultaetsTest1() {
		assertEquals(6, r.fakultaet(3), 0.0);
	}
	
}
            }
        }
        stage('Deploy') { 
            steps {
                echo("Deploying Stage") 
            }
        }
    }
}