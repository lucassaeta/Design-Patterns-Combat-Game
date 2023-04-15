
package Worlds;

public enum World
{
    EVERFROST(1.0), FORGOTTEN_MOUNTAIN(1.5), RUINED_CASTLE(3.0);
    private Double complexFactor;

	public Double getComplexFactor()
    {
        return complexFactor;
    }
    World(Double complexFactor)
    {
        this.complexFactor = complexFactor;
    }
}