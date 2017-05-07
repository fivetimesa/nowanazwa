/*
 * Copyright (C) 2017 Teodor Michalski, Maciek Bajor, Paweł Sikorski
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package frazer;
import java.util.Random;

/**
 *
 * @author Teodor Michalski, Maciek Bajor, Paweł Sikorski
 */
public class FloatGenotype extends Genotype {

    float[] genes;

    public FloatGenotype(int count) {
        super(count);
        genes = new float[count];
    }

    @Override
    public void randomInit() {
    	Random generator = new Random();
    	for(int i = 0; i < count; i++)
    		genes[i] = generator.nextFloat();
    }

    public void randomInit(float min, float max) {
    	Random generator = new Random();
    	for(int i = 0; i < count; i++)
    		genes[i] = min + generator.nextFloat() * (max - min);
    }

}
