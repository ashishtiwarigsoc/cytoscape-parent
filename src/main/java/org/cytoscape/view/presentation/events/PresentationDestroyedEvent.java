package org.cytoscape.view.presentation.events;

import org.cytoscape.event.AbstractCyEvent;
import org.cytoscape.view.presentation.RenderingEngine;

/**
 * When presentation (rendered graphics) is destroyed, this event should be fired.
 *
 */
public class PresentationDestroyedEvent extends AbstractCyEvent<RenderingEngine<?>> {

	/**
	 * Construct an event for restroyed {@linkplain RenderingEngine}.
	 * 
	 * @param source RenderingEngine for the deleted presentation.
	 */
	public PresentationDestroyedEvent(final RenderingEngine<?> source) {
		super(source, PresentationDestroyedEventListener.class);
	}

}
