/*
 * Copyright 2015 Taylor Caldwell
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.rithms.riot.api.endpoints.current_game.dto;

import java.io.Serializable;
import java.util.List;

public class CurrentGameParticipant implements Serializable {

	private static final long serialVersionUID = -2549733502630146814L;

	private boolean bot;
	private int championId;
	private List<Mastery> masteries;
	private int profileIconId;
	private List<Rune> runes;
	private int spell1Id;
	private int spell2Id;
	private long summonerId;
	private String summonerName;
	private int teamId;

	public int getChampionId() {
		return championId;
	}

	public List<Mastery> getMasteries() {
		return masteries;
	}

	public int getProfileIconId() {
		return profileIconId;
	}

	public List<Rune> getRunes() {
		return runes;
	}

	public int getSpell1Id() {
		return spell1Id;
	}

	public int getSpell2Id() {
		return spell2Id;
	}

	public long getSummonerId() {
		return summonerId;
	}

	public String getSummonerName() {
		return summonerName;
	}

	public int getTeamId() {
		return teamId;
	}

	public boolean isBot() {
		return bot;
	}
}