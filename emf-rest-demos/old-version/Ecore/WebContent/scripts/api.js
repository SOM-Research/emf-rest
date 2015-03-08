
	
function EAttribute(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/EAttribute"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.eAnnotations = function(aId){
    	return new EAnnotation(this.url+"/eAnnotations",aId);
 	};
 	this.eType = function(aId){
    	return new EClassifier(this.url+"/eType",aId);
 	};
 	this.eGenericType = function(aId){
    	return new EGenericType(this.url+"/eGenericType",aId);
 	};
 	this.eContainingClass = function(aId){
    	return new EClass(this.url+"/eContainingClass",aId);
 	};
 	this.eAttributeType = function(aId){
    	return new EDataType(this.url+"/eAttributeType",aId);
 	};
}

	
function EAnnotation(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
 	this.eAnnotations = function(aId){
    	return new EAnnotation(this.url+"/eAnnotations",aId);
 	};
 	this.details = function(aId){
    	return new EStringToStringMapEntry(this.url+"/details",aId);
 	};
 	this.eModelElement = function(aId){
    	return new EModelElement(this.url+"/eModelElement",aId);
 	};
 	this.contents = function(aId){
    	return new EObject(this.url+"/contents",aId);
 	};
 	this.references = function(aId){
    	return new EObject(this.url+"/references",aId);
 	};
}

	
function EClass(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/EClass"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.eAnnotations = function(aId){
    	return new EAnnotation(this.url+"/eAnnotations",aId);
 	};
 	this.ePackage = function(aId){
    	return new EPackage(this.url+"/ePackage",aId);
 	};
 	this.eTypeParameters = function(aId){
    	return new ETypeParameter(this.url+"/eTypeParameters",aId);
 	};
 	this.eSuperTypes = function(aId){
    	return new EClass(this.url+"/eSuperTypes",aId);
 	};
 	this.eOperations = function(aId){
    	return new EOperation(this.url+"/eOperations",aId);
 	};
 	this.eAllAttributes = function(aId){
    	return new EAttribute(this.url+"/eAllAttributes",aId);
 	};
 	this.eAllReferences = function(aId){
    	return new EReference(this.url+"/eAllReferences",aId);
 	};
 	this.eReferences = function(aId){
    	return new EReference(this.url+"/eReferences",aId);
 	};
 	this.eAttributes = function(aId){
    	return new EAttribute(this.url+"/eAttributes",aId);
 	};
 	this.eAllContainments = function(aId){
    	return new EReference(this.url+"/eAllContainments",aId);
 	};
 	this.eAllOperations = function(aId){
    	return new EOperation(this.url+"/eAllOperations",aId);
 	};
 	this.eAllStructuralFeatures = function(aId){
    	return new EStructuralFeature(this.url+"/eAllStructuralFeatures",aId);
 	};
 	this.eAllSuperTypes = function(aId){
    	return new EClass(this.url+"/eAllSuperTypes",aId);
 	};
 	this.eIDAttribute = function(aId){
    	return new EAttribute(this.url+"/eIDAttribute",aId);
 	};
 	this.eStructuralFeatures = function(aId){
    	return new EStructuralFeature(this.url+"/eStructuralFeatures",aId);
 	};
 	this.eGenericSuperTypes = function(aId){
    	return new EGenericType(this.url+"/eGenericSuperTypes",aId);
 	};
 	this.eAllGenericSuperTypes = function(aId){
    	return new EGenericType(this.url+"/eAllGenericSuperTypes",aId);
 	};
}

	
function EClassifier(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
 	this.eAnnotations = function(aId){
    	return new EAnnotation(this.url+"/eAnnotations",aId);
 	};
 	this.ePackage = function(aId){
    	return new EPackage(this.url+"/ePackage",aId);
 	};
 	this.eTypeParameters = function(aId){
    	return new ETypeParameter(this.url+"/eTypeParameters",aId);
 	};
}

	
function EDataType(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/EDataType"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.eAnnotations = function(aId){
    	return new EAnnotation(this.url+"/eAnnotations",aId);
 	};
 	this.ePackage = function(aId){
    	return new EPackage(this.url+"/ePackage",aId);
 	};
 	this.eTypeParameters = function(aId){
    	return new ETypeParameter(this.url+"/eTypeParameters",aId);
 	};
}

	
function EEnum(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/EEnum"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.eAnnotations = function(aId){
    	return new EAnnotation(this.url+"/eAnnotations",aId);
 	};
 	this.ePackage = function(aId){
    	return new EPackage(this.url+"/ePackage",aId);
 	};
 	this.eTypeParameters = function(aId){
    	return new ETypeParameter(this.url+"/eTypeParameters",aId);
 	};
 	this.eLiterals = function(aId){
    	return new EEnumLiteral(this.url+"/eLiterals",aId);
 	};
}

	
function EEnumLiteral(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
 	this.eAnnotations = function(aId){
    	return new EAnnotation(this.url+"/eAnnotations",aId);
 	};
 	this.eEnum = function(aId){
    	return new EEnum(this.url+"/eEnum",aId);
 	};
}

	
function EFactory(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/EFactory"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.eAnnotations = function(aId){
    	return new EAnnotation(this.url+"/eAnnotations",aId);
 	};
 	this.ePackage = function(aId){
    	return new EPackage(this.url+"/ePackage",aId);
 	};
}

	
function EModelElement(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
 	this.eAnnotations = function(aId){
    	return new EAnnotation(this.url+"/eAnnotations",aId);
 	};
}

	
function ENamedElement(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
 	this.eAnnotations = function(aId){
    	return new EAnnotation(this.url+"/eAnnotations",aId);
 	};
}

	
function EObject(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
}

	
function EOperation(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
 	this.eAnnotations = function(aId){
    	return new EAnnotation(this.url+"/eAnnotations",aId);
 	};
 	this.eType = function(aId){
    	return new EClassifier(this.url+"/eType",aId);
 	};
 	this.eGenericType = function(aId){
    	return new EGenericType(this.url+"/eGenericType",aId);
 	};
 	this.eContainingClass = function(aId){
    	return new EClass(this.url+"/eContainingClass",aId);
 	};
 	this.eTypeParameters = function(aId){
    	return new ETypeParameter(this.url+"/eTypeParameters",aId);
 	};
 	this.eParameters = function(aId){
    	return new EParameter(this.url+"/eParameters",aId);
 	};
 	this.eExceptions = function(aId){
    	return new EClassifier(this.url+"/eExceptions",aId);
 	};
 	this.eGenericExceptions = function(aId){
    	return new EGenericType(this.url+"/eGenericExceptions",aId);
 	};
}

	
function EPackage(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
 	this.eAnnotations = function(aId){
    	return new EAnnotation(this.url+"/eAnnotations",aId);
 	};
 	this.eFactoryInstance = function(aId){
    	return new EFactory(this.url+"/eFactoryInstance",aId);
 	};
 	this.eClassifiers = function(aId){
    	return new EClassifier(this.url+"/eClassifiers",aId);
 	};
 	this.eSubpackages = function(aId){
    	return new EPackage(this.url+"/eSubpackages",aId);
 	};
 	this.eSuperPackage = function(aId){
    	return new EPackage(this.url+"/eSuperPackage",aId);
 	};
}

	
function EParameter(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
 	this.eAnnotations = function(aId){
    	return new EAnnotation(this.url+"/eAnnotations",aId);
 	};
 	this.eType = function(aId){
    	return new EClassifier(this.url+"/eType",aId);
 	};
 	this.eGenericType = function(aId){
    	return new EGenericType(this.url+"/eGenericType",aId);
 	};
 	this.eOperation = function(aId){
    	return new EOperation(this.url+"/eOperation",aId);
 	};
}

	
function EReference(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/EReference"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.eAnnotations = function(aId){
    	return new EAnnotation(this.url+"/eAnnotations",aId);
 	};
 	this.eType = function(aId){
    	return new EClassifier(this.url+"/eType",aId);
 	};
 	this.eGenericType = function(aId){
    	return new EGenericType(this.url+"/eGenericType",aId);
 	};
 	this.eContainingClass = function(aId){
    	return new EClass(this.url+"/eContainingClass",aId);
 	};
 	this.eOpposite = function(aId){
    	return new EReference(this.url+"/eOpposite",aId);
 	};
 	this.eReferenceType = function(aId){
    	return new EClass(this.url+"/eReferenceType",aId);
 	};
 	this.eKeys = function(aId){
    	return new EAttribute(this.url+"/eKeys",aId);
 	};
}

	
function EStructuralFeature(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
 	this.eAnnotations = function(aId){
    	return new EAnnotation(this.url+"/eAnnotations",aId);
 	};
 	this.eType = function(aId){
    	return new EClassifier(this.url+"/eType",aId);
 	};
 	this.eGenericType = function(aId){
    	return new EGenericType(this.url+"/eGenericType",aId);
 	};
 	this.eContainingClass = function(aId){
    	return new EClass(this.url+"/eContainingClass",aId);
 	};
}

	
function ETypedElement(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
 	this.eAnnotations = function(aId){
    	return new EAnnotation(this.url+"/eAnnotations",aId);
 	};
 	this.eType = function(aId){
    	return new EClassifier(this.url+"/eType",aId);
 	};
 	this.eGenericType = function(aId){
    	return new EGenericType(this.url+"/eGenericType",aId);
 	};
}

	
function EStringToStringMapEntry(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
}

	
function EGenericType(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
 	this.eUpperBound = function(aId){
    	return new EGenericType(this.url+"/eUpperBound",aId);
 	};
 	this.eTypeArguments = function(aId){
    	return new EGenericType(this.url+"/eTypeArguments",aId);
 	};
 	this.eRawType = function(aId){
    	return new EClassifier(this.url+"/eRawType",aId);
 	};
 	this.eLowerBound = function(aId){
    	return new EGenericType(this.url+"/eLowerBound",aId);
 	};
 	this.eTypeParameter = function(aId){
    	return new ETypeParameter(this.url+"/eTypeParameter",aId);
 	};
 	this.eClassifier = function(aId){
    	return new EClassifier(this.url+"/eClassifier",aId);
 	};
}

	
function ETypeParameter(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
 	this.eAnnotations = function(aId){
    	return new EAnnotation(this.url+"/eAnnotations",aId);
 	};
 	this.eBounds = function(aId){
    	return new EGenericType(this.url+"/eBounds",aId);
 	};
}


function stipTrailingSlash(str){
   if(str.charAt(str.length-1) == "/"){ str = str.substr(0, str.length - 1);}
   return str;
}

function restApi() {
	this.callGet = function(url, doneCallBack, depth, failCallBack) {
	  callAjax("GET", url, {depth : (depth ? depth : 0 )}, doneCallBack, failCallBack);
	};

	this.callPut = function(url, data,  doneCallBack, depth, failCallBack) {
	  callAjax("GET", url, {depth : (depth ? depth : 0 )}, doneCallBack, failCallBack);
	};

	this.callPost = function(url, data, doneCallBack, depth, failCallBack) {
	  callAjax("GET", url, {depth : (depth ? depth : 0 )}, doneCallBack, failCallBack);
	};

	this.callDelete = function(url, doneCallBack, depth, failCallBack) {
	  callAjax("GET", url, {depth : (depth ? depth : 0 )}, doneCallBack, failCallBack);
	};
	
	function callAjax(method, url, params, doneCallBack, errorCallBack){
	$.ajax({
		type: method,
		data: params,
		url : url,
		beforeSend : function(xhr) {
			xhr.overrideMimeType("application/json; charset=x-user-defined");
		} 
	}).done(function(data) {
		   doneCallBack(data);
	}).fail(function(){
	
	});	
}

}

var RestApi = new restApi();