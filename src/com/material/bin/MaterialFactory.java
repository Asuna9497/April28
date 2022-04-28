package com.material.bin;

public class MaterialFactory {
	
	public MaterialData getMaterialData(String materialName) {

		if (null == materialName) {
			return null;
		}

		if (materialName.equalsIgnoreCase("copper")) {
			return new Copper();

		} else if (materialName.equalsIgnoreCase("Aluminium")) {
			return new Aluminium();

		} else if (materialName.equalsIgnoreCase("Cast Iron".trim())) {
			return new CastIron();

		} else if (materialName.equalsIgnoreCase("Steel")) {
			return new Steel();

		}

		return null;

	}

}
