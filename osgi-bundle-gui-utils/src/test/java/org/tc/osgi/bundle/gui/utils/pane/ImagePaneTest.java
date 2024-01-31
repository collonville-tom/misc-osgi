/**
 */
package org.tc.osgi.bundle.gui.utils.pane;

import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JDialog;

import org.junit.jupiter.api.Assertions;

/**
 * ImagePaneTest.java.
 * 
 * @author collonville thomas
 * @version
 * @track
 */
public class ImagePaneTest {

	/**
	 * test.
	 */
	@org.junit.jupiter.api.Test
	public void test() {
		try {
			final JDialog dial = new JDialog();
			try {
				dial.add(new ImagePane(ImageIO.read(new File("src/test/resources/docvierge.bmp"))));
			} catch (final IOException e) {
				Assertions.fail(e.getLocalizedMessage());
			}
			dial.show();
		} catch (HeadlessException e) {
			System.out.println("Test cannot be run :"+ e);
		}
	}
}
