package io.deadmanworking;


public class Unit  {

    // Each unit has a datasheet that lists the characteristics, wargear, abilities and
    // keywords of its models.
    // A unit has a datasheet. The information of a datasheet is applied to individual models.

    public final String datasheetName;
    // The name of the unit. Individual models have individual names.

    // PROFILES -- characteristics that indicate how mighty the models in a unit are.
    public final int movementProfile;
    // (M)
    // This is the speed at which a model moves across the battlefield. (Represented in inches)
    // '-' is used to represent that a model can't move. #TODO: Should this be 0 or null?
    public final int toughnessProfile;
    // (T)
    // This reflects the model's resilience against physical harm.
    public final int saveProfile;
    // (Sv)
    // This indicates the protection a model's armour gives them.

    public final int woundsProfile;
    // (W)
    // Wounds represent how much a damage a model can sustain before it succumbs to its injuries.
    // If a model's Wounds characteristic is reduced to 0, it is destroyed.
    public final int leadershipProfile;
    // (Ld)
    // This reveals how courageous, determined or self-controlled a model is.
    // The lower this number, the better a model's Leadership is.
    public final int objectiveControlProfile;

    public Unit(String datasheetName, int movementProfile, int toughnessProfile, int saveProfile, int woundsProfile, int leadershipProfile, int objectiveControlProfile) {
        this.datasheetName = datasheetName;
        this.movementProfile = movementProfile;
        this.toughnessProfile = toughnessProfile;
        this.saveProfile = saveProfile;
        this.woundsProfile = woundsProfile;
        this.leadershipProfile = leadershipProfile;
        this.objectiveControlProfile = objectiveControlProfile;
    }

    public String getDatasheetName() {
        return datasheetName;
    }

    public int getMovementProfile() {
        return movementProfile;
    }

    public int getToughnessProfile() {
        return toughnessProfile;
    }

    public int getSaveProfile() {
        return saveProfile;
    }

    public int getWoundsProfile() {
        return woundsProfile;
    }

    public int getLeadershipProfile() {
        return leadershipProfile;
    }

    public int getObjectiveControlProfile() {
        return objectiveControlProfile;
    }
    // (OC)
    // This shows how effectively a model can exert control over an objective on the battlefield.

    // ABILITIES

    // WEAPONS

    // KEYWORDS

    // UNIT COMPOSITION AND OTHER RULES

    // WARGEAR OPTIONS


    }
