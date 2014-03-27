package org.locationtech.udig.project.memento;


import static org.junit.Assert.*;

import org.junit.Test;

public class UdigMementoTest {

	@Test
	public void testGetChildrenReturnsNotNullIfEmpty() {
		UdigMemento m = new UdigMemento();
		assertNotNull(m.getChildren());
	}

	@Test
	public void testGetChildrenReturnsArrayOfMementos() {
		UdigMemento m = new UdigMemento();
		m.createChild("A", "b");
		m.createChild("C", "d");
		assertEquals(2, m.getChildren().length);
	}

}
