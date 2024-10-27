```toml
name = 'Add images to products'
method = 'GET'
url = '{{baseUrl}}/images/image/download/{imageId}'
sortWeight = 250000
id = '2c6a56e2-dc18-435a-90a9-c843ce65794f'

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
