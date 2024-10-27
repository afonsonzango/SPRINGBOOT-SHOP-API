```toml
name = 'Get downloadable image'
method = 'POST'
url = '{{baseUrl}}/images/upload'
sortWeight = 500000
id = '936f6669-fdf3-4ab0-a88e-9b5c20f88a79'

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
