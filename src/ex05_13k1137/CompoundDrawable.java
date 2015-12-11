package ex05_13k1137;

import java.awt.Color;

public interface CompoundDrawable extends Drawable{
	Drawable[] getParts();
	void setDefaultColor();
	void setSelectedColor();
}
