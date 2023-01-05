public class Plane {
    private double speed;
    private final double maxSpeed;
    private final int maxCountOfPeople;
    private final String planeName;
    private final boolean isAutoPilot;

    Plane(String planeName, double maxSpeed, int maxCountOfPeople, double speed, boolean isAutoPilot) {  // ����������� ��'����
        this.planeName = planeName;
        this.maxSpeed = maxSpeed;
        this.maxCountOfPeople = maxCountOfPeople;
        this.speed = speed;
        this.isAutoPilot = isAutoPilot;
    }

    public boolean checkEnoughPlace(int peopleCount) {  // ���������, �� ��������� ����� �����
        return peopleCount <= maxCountOfPeople;
    }

    public double getSpeed(){   // �������� �������� �����
        return speed;
    }

    public int getMaxCountOfPeople(){   // �������� ����������� ������� ��������
        return maxCountOfPeople;
    }

    @Override
    public String toString() {  // ���� ���������� ��� ����
        return "����� ����� - " + planeName + "\n" +
                "����������� �������� - " + maxSpeed + "\n" +
                "����������� ������� ����� � ����� - " + maxCountOfPeople + "\n" +
                "�������� - " + speed + "\n" +
                "�������� - " + (isAutoPilot ? "���" : "�");
    }
}