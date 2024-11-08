/*
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * AbstractFontScalar.java
 * Copyright (C) 2019 University of Waikato, Hamilton, NZ
 */

package adams.flow.transformer.wordcloud;

import adams.core.MessageCollection;
import adams.core.option.AbstractOptionHandler;
import com.kennycason.kumo.font.scale.FontScalar;

/**
 * Ancestor for WordCloud font scalars.
 *
 * @author FracPete (fracpete at waikato dot ac dot nz)
 */
public abstract class AbstractFontScalar
  extends AbstractOptionHandler {

  private static final long serialVersionUID = 6777267021650265041L;

  /**
   * Generates the font scalar.
   *
   * @param errors 	for collecting errors
   * @return		the font scalar, null if none generated
   */
  public abstract FontScalar generate(MessageCollection errors);
}
