
	
function Family(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/Family"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.parents = function(aId){
    	return new Parent(this.url+"/parents",aId);
 	};
 	this.sons = function(aId){
    	return new Son(this.url+"/sons",aId);
 	};
 	this.daughters = function(aId){
    	return new Daughter(this.url+"/daughters",aId);
 	};
 	this.pets = function(aId){
    	return new Pet(this.url+"/pets",aId);
 	};
}

	
function Member(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
}

	
function Parent(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
 	this.family = function(aId){
    	return new Family(this.url+"/family",aId);
 	};
}

	
function Son(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
 	this.family = function(aId){
    	return new Family(this.url+"/family",aId);
 	};
}

	
function Daughter(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
 	this.family = function(aId){
    	return new Family(this.url+"/family",aId);
 	};
}

	
function Pet(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
}

	
function Dog(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/Dog"+(pId ? "/"+pId : "");
	this.id = pId;
}

	
function Cat(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/Cat"+(pId ? "/"+pId : "");
	this.id = pId;
}

	
function RaceDog(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/RaceDog"+(pId ? "/"+pId : "");
	this.id = pId;
}

	
function HuntingDog(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/HuntingDog"+(pId ? "/"+pId : "");
	this.id = pId;
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