```toml
name = 'Delete image'
method = 'DELETE'
url = '{{baseUrl}}/images/image/{imageId}/delete'
sortWeight = 2500000
id = '93de0d05-a342-4f7e-9a7d-939803f8586e'

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
