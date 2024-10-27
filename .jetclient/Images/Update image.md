```toml
name = 'Update image'
method = 'PUT'
url = '{{baseUrl}}/images/image/{imageId}/update'
sortWeight = 1500000
id = '077c3c8c-4cd6-4a74-a2e6-11a139bfa6c8'

[[pathVariables]]
key = 'imageId'
value = '1'

[[body.formData]]
key = 'productId'
value = '1'

[[body.formData]]
type = 'FILE'
key = 'files'
value = '/home/richard/Downloads/15 exemples de logo pour un électricien - Graphiste Blog.jpeg'

[[body.formData]]
type = 'FILE'
key = 'files'
value = '/home/richard/Downloads/3feb75af6807b3d280ab0d0c1a42e5b2.jpg'
```
