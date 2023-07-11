
#### Object: dating-app
#### Type: Namespace

### Cluster에 dating-app Namespace를 생성하려면 아래의 명령어를 실행하세요.

```
$ kubectl create -f https://minio.msaez.io/labs-msaez.io/yamlStorage/dating-app/jyjang%40uengine.org/Namespace/dating-app.yaml?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=minio%2F20230711%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230711T005738Z&X-Amz-Expires=60&X-Amz-SignedHeaders=host&X-Amz-Signature=f4b5355da70e8262bb577a1b894cd4c5acd6165d97e44203b318c6ee15533e45
```
- Yaml 파일에 명시된 스펙으로 dating-app Namespace를 생성합니다.

```
$ kubectl apply -f https://minio.msaez.io/labs-msaez.io/yamlStorage/dating-app/jyjang%40uengine.org/Namespace/dating-app.yaml?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=minio%2F20230711%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230711T005738Z&X-Amz-Expires=60&X-Amz-SignedHeaders=host&X-Amz-Signature=f4b5355da70e8262bb577a1b894cd4c5acd6165d97e44203b318c6ee15533e45
```
- Create가 된 상태라면 dating-app Namespace의 수정이 이루어지고, Create가 된 상태가 아니라면 dating-app Namespace를 Create 해주는 명령어입니다.  
#

### dating-app Namespace가 정상적으로 생성되었는지 확인하시려면 아래의 명령어를 실행하세요.

```
$ kubectl get Namespace

NAME                   STATUS   AGE
default                Active   10d
kube-node-lease        Active   10d
kube-public            Active   10d
kube-system            Active   10d
dating-app        Active   10d

```
- dating-app Namespace와 Pod, Replicaset이 모두 확인이 된다면 정상적으로 생성된 것입니다.
#

```
$ kubectl delete Namespace dating-app
```
#
