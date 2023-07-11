
#### Object: feedbackservice
#### Type: Deployment

### Cluster에 feedbackservice Deployment를 생성하려면 아래의 명령어를 실행하세요.

```
$ kubectl create -f https://minio.msaez.io/labs-msaez.io/yamlStorage/dating-app/jyjang%40uengine.org/Deployment/feedbackservice.yaml?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=minio%2F20230711%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230711T005321Z&X-Amz-Expires=60&X-Amz-SignedHeaders=host&X-Amz-Signature=d6dd80e49f06e615b0f5cf35aafcf86b3d84045d5cd29030b5ae622d37e8ebaf
```
- Yaml 파일에 명시된 스펙으로 feedbackservice Deployment를 생성합니다.

```
$ kubectl apply -f https://minio.msaez.io/labs-msaez.io/yamlStorage/dating-app/jyjang%40uengine.org/Deployment/feedbackservice.yaml?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=minio%2F20230711%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230711T005321Z&X-Amz-Expires=60&X-Amz-SignedHeaders=host&X-Amz-Signature=d6dd80e49f06e615b0f5cf35aafcf86b3d84045d5cd29030b5ae622d37e8ebaf
```
- Create가 된 상태라면 feedbackservice Deployment의 수정이 이루어지고, Create가 된 상태가 아니라면 feedbackservice Deployment를 Create 해주는 명령어입니다.  
#

### feedbackservice Deployment가 정상적으로 생성되었는지 확인하시려면 아래의 명령어를 실행하세요.

```
$ kubectl get Deployment

NAME            READY   UP-TO-DATE   AVAILABLE   AGE
feedbackservice           3/3     3            3           5m43s

```
- feedbackservice Deployment와 Pod, Replicaset이 모두 확인이 된다면 정상적으로 생성된 것입니다.
#

### 생성된 feedbackservice Deployment의 상세 실행 정보를 확인하시려면 아래의 명령어를 입력하세요.

```
$ kubectl describe Deployment feedbackservice
```
- feedbackservice Deployment의 상태를 확인하여 문제가 있는지 확인합니다. 
#

### Kubernetes Cluster network 외부에서 service에 access할 때, 해당 명령어로 외부 IP traffic을 허용할 수 있습니다.

```
$ kubectl port-forward Deployment/feedbackservice 8080:8080
```
#

### feedbackservice Deployment를 삭제하려면 아래의 명령어를 실행하세요.

```
$ kubectl delete Deployment feedbackservice
```
#

