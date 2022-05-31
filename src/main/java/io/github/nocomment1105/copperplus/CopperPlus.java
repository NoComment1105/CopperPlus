/*
 * Copyright (c) 2022 NoComment1105 <nocomment1105@outlook.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.github.nocomment1105.copperplus;

import io.github.nocomment1105.copperplus.registry.CopperPlusRegistry;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CopperPlus implements ModInitializer {

	public static final String MODID = "copperplus";
	public static final Logger LOGGER = LoggerFactory.getLogger("CopperPlus");

	@Override
	public void onInitialize(ModContainer mod) {
		CopperPlusRegistry.init();
	}

	/**
	 * Create an identifier with the mod ID as the namespace
	 * @param path The identifier's path
	 * @return the identifier
	 */
	public static Identifier id(String path) {
		return new Identifier(MODID, path);
	}

	/**
	 * Create a string with the mod ID as the namespace
	 * @param path The identifier's path
	 * @return the identifier
	 */
	public static String stringId(String path) {
		return MODID + ":" + path;
	}
}
