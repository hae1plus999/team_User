package UserEntity;

public class WorkerUserEntity extends PrivateUserEntity { //직장인고객 속성클래스

    private String workerPlace; //소속된 회사
    private String job; //직급

    public WorkerUserEntity() {}

    public WorkerUserEntity(int id, String name, String tel, String email, String pw, String address,
                             long joinedDate, String grade, String personalNumber, String favoriteGenre,
                             String workerPlace, String job) {

        super(id, name, tel, email, pw, address, joinedDate, grade, personalNumber, favoriteGenre);
        this.setWorkerPlace(workerPlace);
        this.setJob(job);
    }

    public String getWorkerPlace() {
        return workerPlace;
    }

    public void setWorkerPlace(String workerPlace) {
        this.workerPlace = workerPlace;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
