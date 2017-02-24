package org.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.messenger.database.DatabaseClass;
import org.messenger.model.Profile;

public class ProfileService {

	private Map<String, Profile> profiles = DatabaseClass.getProfiles();
	
	public ProfileService() {
//		profiles.put("id", new Profile());
	}

	public List<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profiles.values());
	}

	public Profile getProfile(String profileName) {
		return profiles.get(profileName);
	}

	public Profile addProfile(Profile profile) {
		profile.setId(profiles.size() + 1);
		profiles.put(profile.getName(), profile);
		return profile;

	}

	public Profile updateProfile(Profile profile) {
		if (profile.getName().isEmpty()) {
			return null;
		}
		profiles.put(profile.getName(), profile);
		return profile;

	}

	public Profile removeProfile(String profilename) {
		return profiles.remove(profilename);

	}

}
