What is EMF-REST?
=================

EMF-REST generates truly RESTful APIs for your EMF models. EMF-REST complements the existing (Java-based) API generation facilities EMF already provides and extends them to the Web.

Thanks to EMF-REST, web developers can quickly get a JSON-based RESTful API derived from their models plus a JavaScript library to simplify the interaction with the API.

* EMF-REST automatically creates a RESTful API conforming to the JAX-RS specification that can be automatically deployed in your application server.Generation of REST services in the server based on the Java JAX-RS specification.
* All the communication with the API is done via JSON objects. Currently, these objects are then stored as XML files in the server.
* EMF-REST also generates a JavaScript library to facilitate the management of the API on the client-side (e.g. use of the dot notation for navigation).