/*
 * Copyright 2017 Tilmann Zaeschke
 * 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.tinspin.index.phtree;

import org.tinspin.index.PointEntryDist;

public class DistEntryP<T> extends EntryP<T> implements PointEntryDist<T> {
	
	private double dist;
	
	/**
	 * Create a new entry with distance
	 * @param point point
	 * @param val value
	 * @param dist distance
	 */
	public DistEntryP(double[] point, T val, double dist) {
		super(point, val);
		this.dist = dist;
	}
	
	/**
	 * @return the distance
	 */
	@Override
	public double dist() {
		return dist;
	}
	
	@Override
	public String toString() {
		return super.toString() + ";dist=" + dist;
	}
}